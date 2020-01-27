package com.company;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }
    /**
     * Этот метод проверяет пол людей. Если пол разный - пытается женить.
     * Если у одного из них есть другой супруг - выполняется развод (устанавливает супруга = пустой указатель для мужа и жены.
     * Пример: если у обоих есть супруги - тогда разводятся, установит 4 супругов в пустой указатель), и затем выполняет, женятся ().
     * @param person -  новый муж/жена к этому человеку.
     * @return - возвращает true если этот человек другого пола, в отличие от второго человека и они не муж и жена, иначе false
     */
    public boolean marry(Person person) {
        if (this.man != person.man && person.spouse == null && this.spouse == null) {
            //свадьба
            this.spouse = person;
            person.spouse = this;
            System.out.println(person.name + " и " + person.spouse.name + " поженились");
            return true;
        } else if (this.man != person.man && (person.spouse != null || this.spouse != null)) {
            //разводим всех
            person.divorce();
            this.divorce();
            //свадьба
            this.spouse = person;
            person.spouse = this;
            System.out.println(person.name + " и " + person.spouse.name + " поженились");
            return true;
        } else {
            System.out.println(this.name  + " и " + person.name + " не удалось поженить");
            return false;
        }
    }
    /**
     * spouse = null - если есть супруг
     * @return true если статус человека был изменен
     */
    public boolean divorce() {
        if (spouse == null) return false;
        System.out.println(this.name + " и " + spouse.name + " разведены");
        this.spouse = null;
        return true;
    }

}

