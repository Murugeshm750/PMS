package com.pms.party_service.entityModel.PartyEntities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "party")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "party_seq")
    @SequenceGenerator(
            name = "party_seq",
            sequenceName = "party_sequence",
            initialValue = 10000,
            allocationSize = 1
    )
    @Column(name = "party_id")
    private Long partyId;

    @Column(name = "party_name")
    private String partyName;

    @Column(name = "is_active")
    private String isActive;

}
