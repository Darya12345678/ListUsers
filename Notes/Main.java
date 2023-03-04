import Controllers.NoteController;
import Model.*;
import Views.ViewNote;

public class Main{
    public static void main(String[] args){
        FileOperation fileOperation = new FileOperationJSON("Note.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote (controller);
        view.run();
    }
}