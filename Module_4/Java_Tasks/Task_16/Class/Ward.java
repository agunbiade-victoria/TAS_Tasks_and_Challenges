package Task_16.Class;

    public class Ward extends Hospital{
        public static void main(String[] args) {
            Hospital apex = new Hospital() {
                @Override
                public void childrenWard() {
                    System.out.println("First Aid Department");
                }

                @Override
                public void consultationRoom() {
                    System.out.println("To meet the paediatricians for diagnosis");
                }
            };
            apex.childrenWard();
            apex.consultationRoom();
        }

        @Override
        public void childrenWard(){
            System.out.println("First Aid Department");
        }


        @Override
        public void consultationRoom(){
            System.out.println("To meet the paediatricians for diagnosis");
        }
    }
