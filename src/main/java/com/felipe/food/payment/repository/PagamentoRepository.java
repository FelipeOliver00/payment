package com.felipe.food.payment.repository;

import com.felipe.food.payment.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository <Pagamento, Long> {
}
