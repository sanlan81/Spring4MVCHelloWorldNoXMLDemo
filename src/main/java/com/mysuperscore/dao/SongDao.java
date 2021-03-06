package com.mysuperscore.dao;


import com.mysuperscore.model.Song;
import com.mysuperscore.model.User;

import java.sql.SQLException;

interface SongDao {
     void create(Song song);
     void update(Song song);
     void delete(Song song);
     Song find(Integer id);
     User findUsername(String name) throws SQLException;
}
