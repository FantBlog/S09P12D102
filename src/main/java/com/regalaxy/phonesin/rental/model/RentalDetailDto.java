package com.regalaxy.phonesin.rental.model;

import com.regalaxy.phonesin.member.model.MemberDto;
import com.regalaxy.phonesin.member.model.entity.Member;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalDetailDto {
//    private Member member;//rental
    private Long member_id;
    private Long rental_id;//rental
    private boolean isY2K;//rental
    private boolean isClimateHumidity;//rental
    private boolean isHomecam;//rental
    private int count;//rental
    private String rental_start;//rental
    private String rental_end;//rental
    private String apply_date;//rental
    private int rental_status;//rental
    private String rental_deliverylocation;//rental
    private int fund;//rental
    private String model_name;//model
    private Long phone_id;//phone
    private Long donation_id;//phone
//    private String waybill_numbers;//rental
}
