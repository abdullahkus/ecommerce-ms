package com.ecommerce.product.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(
        @NotNull(message = "Customer ID is required")
    Integer productId,
    @NotNull(message = "Quantity is required")
    double quantity
) {
}
