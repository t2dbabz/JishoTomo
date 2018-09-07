package net.emojiparty.android.jishotomo.ui.viewmodels;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import net.emojiparty.android.jishotomo.data.room.EntryDao;
import net.emojiparty.android.jishotomo.data.room.SenseDao;

public class EntryViewModelFactory extends ViewModelProvider.NewInstanceFactory {
  private Application application;
  private EntryDao entryDao;
  private SenseDao senseDao;
  private int entryId;

  public EntryViewModelFactory(Application application, EntryDao entryDao, SenseDao senseDao, int entryId) {
    this.application = application;
    this.entryDao = entryDao;
    this.senseDao = senseDao;
    this.entryId = entryId;
  }

  @NonNull @Override public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
    return (T) new EntryViewModel(application, entryDao, senseDao, entryId);
  }
}
