package Class21;

public class Degree {

    void getPrerequisite(){
        System.out.println("To get a Degree, we need to have High School Diploma");
    }
}
    class Bachelors extends Degree{

    }

    class Masters extends Degree {
        @Override
            // Annotation
        void getPrerequisite() {
            super.getPrerequisite();
        }

//    @Override : this is called Annotation
        // Annotation checks by compiler if something is wrong like, the method names are not the same or datatype is different
        // we can use shortcut by just writing the method name Example: getPrerequisite... compiler automatically give everything
        //    with the annotation included

       static class DegreeTester {
            public static void main(String[] args) {

                Degree degree = new Degree();
                degree.getPrerequisite();

                Bachelors bachelors = new Bachelors();
                bachelors.getPrerequisite();

                Masters masters = new Masters();
                masters.getPrerequisite();
            }
        }

    }