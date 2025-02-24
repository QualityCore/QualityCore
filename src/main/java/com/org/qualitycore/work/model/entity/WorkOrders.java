package com.org.qualitycore.work.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "WORK_ORDER")
@Entity
@Schema(description = "작업지시서 관련 Entity")
public class WorkOrders {

    @Id
    @Column(name = "LOT_NO")
    private String lotNo; // 작업지시 번호(PK)

    @Column(name = "PLAN_LINE_ID")
    private String planLineId; // 생산라인 엔티티

    @Column(name = "PLAN_PRODUCT_ID")
    private String planProductId; // 생산제품 엔티티

    @Column(name = "EMP_ID")
    private String empId; // 사원 엔티티

    @Column(name = "WORK_PROGRESS")
    private String workProgress; // 진행률

    @Column(name = "WORK_ETC")
    private String workEtc;
}

