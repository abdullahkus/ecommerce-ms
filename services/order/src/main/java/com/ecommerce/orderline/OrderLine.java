package com.ecommerce.orderline;

import com.ecommerce.order.Order;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "customer_line")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_line_seq")
    @SequenceGenerator(name = "customer_line_seq", sequenceName = "customer_line_seq", allocationSize = 1)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private Integer productId;
    private double quantity;
}
