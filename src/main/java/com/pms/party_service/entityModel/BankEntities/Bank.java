package com.pms.party_service.entityModel.BankEntities;

import com.pms.party_service.entityModel.BaseEntities.BaseEntity;
import com.pms.party_service.entityModel.PartyEntities.Party;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "bank")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bank extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bank_seq")
    @SequenceGenerator(name = "bank_seq",sequenceName = "bank_sequence",initialValue = 10000,allocationSize = 1)
    private Long bankId;

    @Column(name = "bank_account_number")
    private String bankAccountNumber;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "upi_id")
    private String upiId;

    @Column(name = "savings_amount")
    private BigDecimal savingsAmount;

    //Relationships

    @OneToOne
    @JoinColumn(name = "party_id")
    private Party party;


}
