package com.pms.party_service.entityModel.BankEntities;

import com.pms.party_service.entityModel.BaseEntities.BaseEntity;
import com.pms.party_service.entityModel.PartyEntities.Party;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bank")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SavingsPlan extends BaseEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY,generator = "savings_seq")
    @SequenceGenerator(name = "savings_seq",sequenceName = "savings_sequence",initialValue = 10000,allocationSize = 1)
    private Long planId;

    @Column(name = "plan_name")
    private String planName;

    @Column(name = "plan_start_date")
    private LocalDateTime planStartDate;

    @Column(name = "plan_end_date")
    private LocalDateTime planEndDate;

    @Column(name = "from_date")
    private LocalDateTime fromDate;

    @Column(name = "thru_date")
    private LocalDateTime thruDate;

    @Column(name = "plan_amount")
    private BigDecimal planAmount;

    @Column(name = "is_active")
    private String isActive;

    //Relationships

    @OneToOne
    @JoinColumn(name = "party_id")
    private Party party;

}
