package GUIPartFor8Lab.views;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableMap;
import javafx.scene.control.TableView;

import java.util.HashMap;

//Objects need to replace with MUSICBAND!!!

public class MusicBandsTableView {
    //private TableView<MusicBand> tableView;
    private TableView<Object> tableView;
   // private ObservableMap<MusicBand, Long> orderedMusicBandMap = FXCollections.observableMap(new HashMap<>());
    private ObservableMap<Long, Object> orderedMusicBandMap =
           FXCollections.observableMap(new HashMap<>());
    //private ObjectProperty<MusicBand> selectedMusicBandProperty = new SimpleObjectProperty<>(null);
    private ObjectProperty<Object> selectedMusicBandProperty =
            new SimpleObjectProperty<>(null);

    public MusicBandsTableView(ObservableMap<Object, Long> musicBands) {
        tableView = createTable();
        musicBands.addListener(new MapChangeListener<Long, Object>() {
            @Override
            public void onChange(Change<? extends Long, ? extends Object> change) {
                if (change.wasAdded()) {
                    /*
                    insertion sort
                    use natural ordering if the user did not specify a comparator
                    using headers in table view
                     */
                    for (int i = 0; i < orderedMusicBandMap.size(); i++) {
                        // comparator here
                        /*
                        if (getComparator().compare(change.getElementAdded(), orderedMusicBandMap.??get(i)) < 0) {
                            orderedMusicBandMap.add(?? i, change.getElementAdded());
                            return;
                        }
                         */
                    }
                    orderedMusicBandMap.put(, change.getValueAdded())
                }
            }
        });
    }

    private TableView<Object> createTable() {
    }
}
