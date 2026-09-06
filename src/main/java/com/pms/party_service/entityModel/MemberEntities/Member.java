package com.pms.party_service.entityModel.MemberEntities;

import com.pms.party_service.entityModel.BaseEntities.BaseEntity;
import com.pms.party_service.entityModel.PartyEntities.Party;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "member")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    @SequenceGenerator(name = "member_seq",sequenceName = "member_sequence",initialValue = 10000,allocationSize = 1)
    private Long memberId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "aadhaar_number", unique = true)
    private Long aadhaarNumber;

    //Relationship
    @ManyToOne
    @JoinColumn(name = "party_id")
    private Party party;


}
