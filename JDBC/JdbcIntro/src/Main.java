import java.sql.*;
import java.util.ArrayList;

public class Main {


  public static void main(String[] args) throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
      connection = helper.getConnection();
      String sql = "delete from city where id = 998";
      statement = connection.prepareStatement(sql);
/*      statement.setString(1, "Turkey");
      statement.setInt(2, 998);*/
      int result = statement.executeUpdate();
      System.out.println("Kayıt Silindi...");
    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
      System.out.println(exception.getMessage());
    } finally {
      statement.close();
      connection.close();
    }
  }

  public static void selectDemo() throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    Statement statement = null;
    ResultSet resultSet = null;
    try {
      connection = helper.getConnection();
      statement = connection.createStatement();
      resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
      ArrayList<Country> countries = new ArrayList<Country>();
      while (resultSet.next()) {
        countries.add(new Country(
                resultSet.getString("Code"),
                resultSet.getString("Name"),
                resultSet.getString("Continent"),
                resultSet.getString("Region")));
      }
      System.out.println(countries.size());

    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
      System.out.println(exception.getMessage());
    } finally {
      connection.close();
    }
  }

  public static void inserData() throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
      connection = helper.getConnection();
      String sql = "insert into world.city (Name,CountryCode,District,Population) values(?,?,?,?)";
      statement = connection.prepareStatement(sql);
      statement.setString(1, "Düzce 2");
      statement.setString(2, "TUR");
      statement.setString(3, "Turkey");
      statement.setInt(4, 70000);
      statement.executeUpdate();
      System.out.println("Kayıt Eklendi...");
    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
      System.out.println(exception.getMessage());
    } finally {
      statement.close();
      connection.close();
    }
  }

  public void updateData() throws SQLException {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    try {
      connection = helper.getConnection();
      String sql = "update city set population='180260',district='Turkey'   where id = 998";
      statement = connection.prepareStatement(sql);
/*      statement.setString(1, "Turkey");
      statement.setInt(2, 998);*/
      int result = statement.executeUpdate();
      System.out.println("Kayıt Güncellendi...");
    } catch (SQLException exception) {
      helper.showErrorMessage(exception);
      System.out.println(exception.getMessage());
    } finally {
      statement.close();
      connection.close();
    }
  }
}