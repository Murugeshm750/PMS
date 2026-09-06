package com.pms.party_service.entityModel.PartyEntities;

import com.pms.party_service.entityModel.BaseEntities.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "party_contact_mech")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PartyContactMech extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contactMech_seq")
    @SequenceGenerator(
            name = "contactMech_seq",
            sequenceName = "contactMech_sequence",
            initialValue = 10000,
            allocationSize = 1
    )
    @Column(name = "contact_mech_id")
    private Long contactMechId;

    @Column(name = "mail_id")
    private String mailId;

    @Column(name = "contact_number")
    private Long contactNumber;

    @Column(name = "address_1")
    private String address1;

    @Column(name = "address_2")
    private String address2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "pin_code")
    private String pinCode;


    // RelationShips

    @ManyToOne
    @JoinColumn(name = "party_id")
    private Party party;
}
