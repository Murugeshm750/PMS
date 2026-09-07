package com.pms.party_service.dto.response.partyResponse;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class partyResponse {
    private Long partyId;
    private String partyName;
}
