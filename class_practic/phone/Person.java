package day6.Abstract_practic.phone;

public class Person {
/*        private Phone phone;             // 생성자 인젝션 스프링에서는 생성자인젝션을 권장하고 있다.
        Person(Phone phone){
            this.phone = phone;
    }
    public void createMessage(){
            String message = "안녕 반가워. 오늘 몇시에 만날까?";
            String to = "내친구";
            this.phone.sendMessage(to, message);
    }*/

    public void sendmassage(Phone phone){   // 메소드 인젝션
        String to = "내 친구";
        String message = "안녕 반가워. 오늘 몇시에 만날까?";
        phone.sendMessage(to, message);
    }

}
