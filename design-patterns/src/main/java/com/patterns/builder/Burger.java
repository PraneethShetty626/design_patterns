




package com.patterns.builder;





public class Burger {

    protected String size;

    private boolean  egg;
    private boolean  mayonees;
    private boolean  cheese;
    private boolean  lattuce;





    private Burger(BurgerBuilder builder) {

    }





    public String getSize() {

        return size;
    }





    public boolean isEgg() {

        return egg;
    }





    public boolean isMayonees() {

        return mayonees;
    }





    public boolean isCheese() {

        return cheese;
    }





    public boolean isLattuce() {

        return lattuce;
    }





    public static class BurgerBuilder {

        protected String size;

        private boolean  egg;
        private boolean  mayonees;
        private boolean  cheese;
        private boolean  lattuce;






        public BurgerBuilder setCheese(boolean cheese) {

            this.cheese = cheese;
            return this;
        }





        public BurgerBuilder setEgg(boolean egg) {

            this.egg = egg;
            return this;

        }





        public BurgerBuilder setLattuce(boolean lattuce) {

            this.lattuce = lattuce;
            return this;

        }





        public BurgerBuilder setMayonees(boolean mayonees) {

            this.mayonees = mayonees;
            return this;

        }





        public BurgerBuilder setSize(String size) {

            this.size = size;
            return this;

        }





        public boolean isCheese() {

            return cheese;
        }





        public boolean isMayonees() {

            return mayonees;
        }





        public boolean isLattuce() {

            return lattuce;
        }





        public boolean isEgg() {

            return egg;
        }


        public  Burger build(){
            return  new Burger(this);
        }
    }
}
