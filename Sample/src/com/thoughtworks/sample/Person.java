package com.thoughtworks.sample;

import com.thoughtworks.ActiveRecord;

public class Person extends ActiveRecord {
    private String lastName;
    private String firstName;
    private Gender gender;
    private int numberOfDependents;

    public Person(String lastName, String firstName, Gender gender, int numberOfDependents) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.numberOfDependents = numberOfDependents;
    }

    public String fullName(){
        return lastName + "." + firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    //    private final static String findStatementString = "SELECT id, lastname, firstname, number_of_dependents" + "  FROM people" + "  WHERE id = ?";
//
//    //find
//    public static Person find(Long id) {
//        Person result = (Person) Registry.getPerson(id);
//        if (result != null) return result;
//        PreparedStatement findStatement = null;
//        ResultSet rs = null;
//        try {
//            findStatement = DB.prepare(findStatementString);
//            findStatement.setLong(1, id.longValue());
//            rs = findStatement.executeQuery();
//            rs.next();
//            result = load(rs);
//            return result;
//        } catch (SQLException e) {
//            throw new ApplicationException(e);
//        } finally {
//            DB.cleanUp(findStatement, rs);
//        }
//    }
//
//    public static Person find(long id) {
//        return find(new Long(id));
//    }
//
//    public static Person load(ResultSet rs) throws SQLException {
//        Long id = new Long(rs.getLong(1));
//        Person result = (Person) Registry.getPerson(id);
//        if (result != null) return result;
//        String lastNameArg = rs.getString(2);
//        String firstNameArg = rs.getString(3);
//        int numDependentsArg = rs.getInt(4);
//        result = new Person(id, lastNameArg, firstNameArg, numDependentsArg);
//        Registry.addPerson(result);
//        return result;
//    }
//
//    //upgrade
//    private final static String updateStatementString = "UPDATE people" + "  set lastname = ?, firstname = ?, number_of_dependents = ?" + "  where id = ?";
//
//    public void update() {
//        PreparedStatement updateStatement = null;
//        try {
//            updateStatement = DB.prepare(updateStatementString);
//            updateStatement.setString(1, lastName);
//            updateStatement.setString(2, firstName);
//            updateStatement.setInt(3, numberOfDependents);
//            updateStatement.setInt(4, getID().intValue());
//            updateStatement.execute();
//        } catch (Exception e) {
//            throw new ApplicationException(e);
//        } finally {
//            DB.cleanUp(updateStatement);
//        }
//    }
//
//    //insert
//    private final static String insertStatementString = "INSERT INTO people VALUES (?, ?, ?, ?)";
//
//    public Long insert() {
//        PreparedStatement insertStatement = null;
//        try {
//            insertStatement = DB.prepare(insertStatementString);
//            setID(findNextDatabaseId());
//            insertStatement.setInt(1, getID().intValue());
//            insertStatement.setString(2, lastName);
//            insertStatement.setString(3, firstName);
//            insertStatement.setInt(4, numberOfDependents);
//            insertStatement.execute();
//            Registry.addPerson(this);
//            return getID();
//        } catch (Exception e) {
//            throw new ApplicationException(e);
//        } finally {
//            DB.cleanUp(insertStatement);
//        }
//    }
//
//    //business logic
//    public Money getExemption() {
//        Money baseExemption = Money.dollars(1500);
//        Money dependentExemption = Money.dollars(750);
//        return baseExemption.add(dependentExemption.multiply(this.getNumberOfDependents()));
//    }

}
