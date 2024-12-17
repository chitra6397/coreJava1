package switchcondition;

public class NestedSwitchBtechBranch {
    public static void main(String[]args){
        char branch ='C';
        int CollegeYear =4;
        switch (CollegeYear) {
            case 1:
                System.out.println("Maths,English,Science");
                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("Operating system,java,data structure");
                        break;
                    case 'E':
                        System.out.println("Micro processor,Logic Switching Theory");
                        break;
                    case 'f':
                        System.out.println("Drawing,Manufacturing");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case 'c':
                        System.out.println("Computer Organization,multimedia");
                        break;
                    case 'E':
                        System.out.println("Fundamental of logic design,Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal combustion engines,Mechanical ");
                        break;
                }
                break;
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Data communication and Networks,MultiMdedia");
                        break;
                    case 'E':
                        System.out.println("Embedded system,image processing");
                        break;
                    case 'M':
                        System.out.println("Product Technology,Thermal Engineering");
                        break;
                }
                break;
        }
    }


}

