package net.emojiparty.android.jishotomo.data.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {
    Entry.class, Sense.class, CrossReference.class
}, version = 3, exportSchema = false) public abstract class AppDatabase extends RoomDatabase {
  public abstract EntryDao entryDao();

  public abstract SenseDao senseDao();
}
