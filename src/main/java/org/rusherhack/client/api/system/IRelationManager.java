package org.rusherhack.client.api.system;
import org.rusherhack.*;

import java.util.List;
import org.rusherhack.client.api.utils.objects.PlayerRelation;

public interface IRelationManager {
   boolean isFriend(String var1);

   void removeFriend(String var1);

   boolean isEnemy(String var1);

   List<PlayerRelation> getEnemies();

   void addFriend(String var1);

   List<PlayerRelation> getFriends();

   void removeEnemy(String var1);

   void addEnemy(String var1);
}
