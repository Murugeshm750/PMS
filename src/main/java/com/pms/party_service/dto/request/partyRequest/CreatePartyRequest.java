package com.pms.party_service.dto.request.partyRequest;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatePartyRequest {
    /* Party Details*/
    private String partyName;

    /* Party Contact Details*/
    private String email;
    private Long phoneNumber;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String pinCode;

    /* User Details */
    private String memberName;
    private Long aadhaarNumber;

    /* Login Details*/
    private String userName;
    private String password;


}
