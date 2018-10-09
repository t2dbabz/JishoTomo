package net.emojiparty.android.jishotomo.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import net.emojiparty.android.jishotomo.R;

import static net.emojiparty.android.jishotomo.ui.activities.DefinitionFragment.ENTRY_ID_EXTRA;
import static net.emojiparty.android.jishotomo.ui.activities.DefinitionFragment.ENTRY_NOT_FOUND;

public class DefinitionActivity extends AppCompatActivity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_definition);
    setupToolbar();
    int entryId = findEntryId(getIntent());
    DefinitionFragment.replaceInContainer(getSupportFragmentManager(), entryId,
        R.id.definition_activity_fragment_container);
  }

  private void setupToolbar() {
    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }

  private int findEntryId(Intent intent) {
    if (intent == null) {
      return ENTRY_NOT_FOUND;
    }
    if (intent.hasExtra(ENTRY_ID_EXTRA)) {
      return intent.getIntExtra(ENTRY_ID_EXTRA, ENTRY_NOT_FOUND);
    } else {
      return ENTRY_NOT_FOUND;
    }
  }
}
