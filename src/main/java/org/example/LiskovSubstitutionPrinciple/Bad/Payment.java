package org.example.LiskovSubstitutionPrinciple.Bad;


    class Payment {
        public void payByCash() {
            System.out.println("Paid by cash");
        }
    }

    class OnlinePayment extends Payment {
        @Override
        public void payByCash() {
            throw new UnsupportedOperationException("Cannot pay by cash");
        }
    }
