package com.pms.party_service.service.impl.partyServiceImpl;

import com.pms.party_service.dto.request.partyRequest.CreatePartyRequest;
import com.pms.party_service.dto.request.partyRequest.UpdatePartyContactRequest;
import com.pms.party_service.dto.request.partyRequest.UpdatePartyRequest;
import com.pms.party_service.dto.response.partyResponse.PartyResponse;
import com.pms.party_service.service.partyService.PartyServices;
import org.springframework.stereotype.Service;

@Service
public class PartyServiceImpl implements PartyServices {
    @Override
    public PartyResponse createParty(CreatePartyRequest request) {
        return null;
    }

    @Override
    public PartyResponse updateParty(UpdatePartyRequest request) {
        return null;
    }

    @Override
    public PartyResponse updatePartyContact(UpdatePartyContactRequest request) {
        return null;
    }
}
