public class main {
public static void main(String[] args) {
    int score = 85;

    if (score >= 90){
        System.out.println("A 학점");
    } else if (score >= 80) {
        System.out.println("B 학점");
    } else if (score >= 70) {
        System.out.println("C 학점");
    } else if (score >= 60) {
        System.out.println("D 학점");
    }

    int age = 17;
    boolean isStudent = true;

    if (age < 18) {
        System.out.println("미성년자");
    } else {
        if (isStudent) {
            System.out.println("성인 학생");
        } else {
            System.out.println("성인");
        }
    }
}

}
}

    
