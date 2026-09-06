package com.pms.party_service.entityModel.MemberEntities;

import com.pms.party_service.entityModel.BaseEntities.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "member_contact_mech")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberContactMech extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_contactMech_seq")
    @SequenceGenerator(
            name = "member_contactMech_seq",
            sequenceName = "member_contactMech_sequence",
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
    @JoinColumn(name = "member_id")
    private Member member;
}
