package com.regalaxy.phonesin.member.model.entity;

import com.regalaxy.phonesin.donation.model.entity.Donation;
import com.regalaxy.phonesin.rental.model.entity.Rental;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    private String email;
    private String memberName;
    private String password;
    private String phoneNumber;
    private Boolean isCha;
    private Boolean isBlackList;
    private Boolean isDelete;
    private Boolean isManager;

    @OneToMany(mappedBy = "member",cascade = ALL,orphanRemoval = true)
    private List<Donation> donationList = new ArrayList<Donation>();

    @OneToMany(mappedBy = "member", cascade = ALL, orphanRemoval = true)
    private List<Rental> rentalList = new ArrayList<>();
}
