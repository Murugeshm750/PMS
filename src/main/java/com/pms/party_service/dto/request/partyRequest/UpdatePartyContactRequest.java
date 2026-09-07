package com.pms.party_service.dto.request.partyRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePartyContactRequest {

    /* Party Contact Details*/
    private Long partyId;
    private String email;
    private Long phoneNumber;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String pinCode;

}
