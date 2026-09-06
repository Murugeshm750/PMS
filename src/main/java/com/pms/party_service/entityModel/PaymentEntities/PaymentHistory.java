package com.pms.party_service.entityModel.PaymentEntities;

import com.pms.party_service.entityModel.BankEntities.SavingsPlan;
import com.pms.party_service.entityModel.MemberEntities.Member;
import com.pms.party_service.entityModel.PartyEntities.Party;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment_history")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "payment_seq")
    @SequenceGenerator(name = "payment_seq",sequenceName = "payment_sequence",initialValue = 10000,allocationSize = 1)
    private Long paymentId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "paid_by")
    private String paidBy;

    @Column(name = "paid_date")
    private LocalDateTime paidDate;

    @Column(name = "verified_date")
    private LocalDateTime verifiedDate;

    @Column(name = "verified_by")
    private String verifiedBy;

    //Relationships

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "party_id")
    private Party party;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id")
    private SavingsPlan savingsPlan;
}
