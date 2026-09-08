package com.pms.party_service.dto.response.partyResponse;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartyResponse {
    private Long partyId;
    private String partyName;
}
