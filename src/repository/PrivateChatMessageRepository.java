package repository;

import entity.PrivateChetMessage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrivateChatMessageRepository {

        public static List<PrivateChetMessage> showAllPrivateChetMessages(Connection connection) throws SQLException {
            List<PrivateChetMessage> privateChetMessages = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from initprivatechatmessagetable");
            while (resultSet.next()) {
                PrivateChetMessage privateChetMessage = new PrivateChetMessage();
                privateChetMessage.setId(resultSet.getInt("id"));
                privateChetMessage.setChat_owner(resultSet.getString("chat_owner"));
                privateChetMessage.setSender(resultSet.getString("sender"));
                privateChetMessage.setText(resultSet.getString("text"));
                privateChetMessage.setReplied(resultSet.getString("replied?"));
                privateChetMessage.setWhome_replied(resultSet.getString("whome_replied?"));
                privateChetMessage.setWhat_replied(resultSet.getString("what_replied?"));
                privateChetMessage.setForwarded(resultSet.getString("forwarded?"));
                privateChetMessage.setForwarded_of_where(resultSet.getString("forwarded_of_where?"));
                privateChetMessage.setEdited(resultSet.getString("edited?"));
                privateChetMessage.setTime(resultSet.getString("time"));
                privateChetMessages.add(privateChetMessage);
            }
            statement.close();
            return privateChetMessages;
        }
}

