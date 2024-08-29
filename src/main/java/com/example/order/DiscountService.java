package com.example.order;

import java.time.LocalDate;

public class DiscountService {

    /*
    protected PromoService promoService = new PromoService();

    public PromoService getPromoService() {
        return promoService;
    }

    public void setPromoService(PromoService promoService) {
        this.promoService = promoService;
    }
    */

    public void applyDiscount(Order order) {
        if (order.getItemCount() >= 20) {  // 1ª decisão
            order.applyDiscount(order.getTotalAmount() * 0.15);
        } else {
            if (order.isLoyaltyMember()) {  // 2ª decisão
                if (order.getItemCount() > 10) {  // 3ª decisão
                    order.applyDiscount(order.getTotalAmount() * 0.10);
                }
            }
        }

        // Verificação de data promocional
        LocalDate today = LocalDate.now();
        LocalDate promoStart = LocalDate.of(today.getYear(), 12, 1);
        LocalDate promoEnd = LocalDate.of(today.getYear(), 12, 31);

        applyDiscountDuringPromotionPeriod(order, today, promoStart, promoEnd);



        // Verificação de código de cupom
        if (order.hasCoupon()) {  // 7ª decisão
            String coupon = order.getCouponCode();
            if ("BLACKFRIDAY".equals(coupon)) {  // 8ª decisão
                order.applyDiscount(order.getTotalAmount() * 0.20);
            } else if ("NEWYEAR".equals(coupon)) {  // 9ª decisão
                order.applyDiscount(order.getTotalAmount() * 0.10);
            }
        }
    }

    private boolean isInPromotionPeriod (LocalDate today, LocalDate promoStart, LocalDate promoEnd) {
        return !today.isBefore(promoStart) && !today.isAfter(promoEnd);
    }

    public void applyDiscountDuringPromotionPeriod(Order order, LocalDate today, LocalDate promoStart, LocalDate promoEnd) {
        if (isInPromotionPeriod(today, promoStart, promoEnd)) {  // 4ª decisão
            if (order.getItemCount() > 5 && !order.isLoyaltyMember()) {  // 5ª e 6ª decisões (&&)
                order.applyDiscount(order.getTotalAmount() * 0.05);
            }
        }
    }
}
