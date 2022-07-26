package homework.collection;


import java.util.*;


public class MapExample {

    public static void main(String[] args) {
        List<FootballTeamMember> footballTeamMember = new ArrayList<>();
        footballTeamMember.add(new FootballTeamMember(10, "Rivaldo"));
        footballTeamMember.add(new FootballTeamMember(9, "Ronaldo"));
        footballTeamMember.add(new FootballTeamMember(6, "Carlos"));
        System.out.println(createFootballTeam(footballTeamMember));


        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "Bartez");
        stringMap.put(2, "Cafu");
        stringMap.put(5, "Sise");
        printAllMemberNames(stringMap);
        printAllMembers(stringMap);
        removeFromMap(stringMap, 1);
        printAllMemberNames(stringMap);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> mapStr = new HashMap<>();
        for (FootballTeamMember footballTeamMember : members) {
            mapStr.put(footballTeamMember.getNumber(), footballTeamMember.getName());
        }
        return mapStr;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
   if (memberMap.keySet().contains(removedNumber)) {
            memberMap.remove(removedNumber);
            return true;
        }
        return false;
    }


    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        Collection<String> values = memberMap.values();
        System.out.println(values);

    }


    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Map.Entry<Integer, String> entry : memberMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

//        Set<Map.Entry<Integer, String>> entries = memberMap.entrySet();
//        System.out.println(entries);

    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FootballTeamMember that = (FootballTeamMember) o;

            if (number != that.number) return false;
            return name != null ? name.equals(that.name) : that.name == null;
        }

        @Override
        public int hashCode() {
            int result = number;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "FootballTeamMember{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
