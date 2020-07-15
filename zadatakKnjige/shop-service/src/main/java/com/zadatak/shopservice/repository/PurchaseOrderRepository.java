package com.zadatak.shopservice.repository;

import com.zadatak.shopservice.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
}
