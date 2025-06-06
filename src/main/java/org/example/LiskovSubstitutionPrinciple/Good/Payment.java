package org.example.LiskovSubstitutionPrinciple.Good;

    interface Payment {
        void pay();
    }

    class CashPayment implements Payment {
        public void pay() {
            System.out.println("Paid by cash");
        }
    }

    class OnlinePayment implements Payment {
        public void pay() {
            System.out.println("Paid online");
        }
    }
