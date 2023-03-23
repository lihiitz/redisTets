package server;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@AllArgsConstructor
public class Controller {

    @Autowired
    private MovementReportRepository movementReportRepository;


    @PostMapping
    public String saveData() {
        MovementReport movementReport = new MovementReport();
        movementReport.setTrackId("trackId1");
        movementReport.setTrackReport("someTaskReport");
        return movementReportRepository.save(movementReport).getTrackId();
    }

    @GetMapping
    public String getData() {
        return movementReportRepository.findById("trackId1").get().getTrackId();
    }
}
