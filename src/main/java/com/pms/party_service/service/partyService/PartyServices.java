package com.pms.party_service.service.partyService;


import com.pms.party_service.dto.request.partyRequest.CreatePartyRequest;
import com.pms.party_service.dto.request.partyRequest.UpdatePartyContactRequest;
import com.pms.party_service.dto.request.partyRequest.UpdatePartyRequest;
import com.pms.party_service.dto.response.partyResponse.PartyResponse;

public interface PartyServices {
    PartyResponse createParty(CreatePartyRequest request);
    PartyResponse updateParty(UpdatePartyRequest request);
    PartyResponse updatePartyContact(UpdatePartyContactRequest request);
}
