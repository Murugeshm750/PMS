package com.pms.party_service.dto.request.partyRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePartyRequest {
    /* Party Details*/
    private Long partyId;
    private String partyName;

}
