package repository;

import entity.Member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    public static List<Member> showAllMembers(Connection connection) throws SQLException {
        List<Member> members = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from initmembertable");
        while (resultSet.next()) {
            Member member = new Member();
            member.setId(resultSet.getInt("id"));
            member.setGroup_name(resultSet.getString("group_name"));
            member.setMember_name(resultSet.getString("member_name"));
            member.setWho_added(resultSet.getString("who_added?"));
            member.setTime(resultSet.getString("time"));
            members.add(member);
        }
        statement.close();
        return members;
    }
}
