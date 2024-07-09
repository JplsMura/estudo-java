package CRUD.Domain.DAO;

import CRUD.Domain.config.DatabaseConnection;
import CRUD.Domain.entity.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO implements PersonDAOInterface{
    @Override
    public void addPerson(Person person) {
        String sql = "INSERT INTO Person (name, age, height, skinColor, gender) VALUES (?, ?, ?, ?, ?)";
        try (
             Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            stmt.setString(1, person.getName());
            stmt.setInt(2, person.getAge());
            stmt.setDouble(3, person.getHeight());
            stmt.setString(4, person.getSkinColor());
            stmt.setString(5, person.getGender());
            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    person.setId(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        String sql = "SELECT * FROM Person";
        try (
             Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ) {
            while (rs.next()) {
                Person person = new Person(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getDouble("height"),
                        rs.getString("skinColor"),
                        rs.getString("gender")
                );
                people.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return people;
    }

    @Override
    public boolean updatePerson(Person person) {
        String sql = "UPDATE Person SET name = ?, age = ?, height = ?, skinColor = ?, gender = ? WHERE id = ?";
        try (
             Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, person.getName());
            stmt.setInt(2, person.getAge());
            stmt.setDouble(3, person.getHeight());
            stmt.setString(4, person.getSkinColor());
            stmt.setString(5, person.getGender());
            stmt.setInt(6, person.getId());
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deletePerson(int id) {
        String sql = "DELETE FROM Person WHERE id = ?";
        try (
             Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
