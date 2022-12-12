package com.example.houssembaltii.Controllers;

import com.example.houssembaltii.Repoistories.ClasseRepo;
import com.example.houssembaltii.Repoistories.CourClassroomRepo;
import com.example.houssembaltii.Repoistories.UtilisateurRepo;
import com.example.houssembaltii.entities.CoursClassroom;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("exam")
@AllArgsConstructor
public class Controller {
    private ClasseRepo classeRepo;
    private CourClassroomRepo courClassroomRepo;
    private UtilisateurRepo utilisateurRepo;

    @PostMapping("/ajouterCourClassroom/{codeClasse}")
    public CoursClassroom ajouterCoursClassroom (@RequestBody CoursClassroom cc,@PathVariable Integer codeClasse){

        return null;
    }
    @Scheduled(fixedRate = 15000)
    public void archiverCoursClassrooms(){
        classeRepo.findAll().stream()
                .forEach(classe -> log.info("size "+classe.getCoursClassroomList().size()))

        ;
    }
   /* @GetMapping
    public List<CategorieProduit> retrieveAllCategorieProduits(){
        return  icategorieProduit.retrieveAllCategorieProduits();
    }
    @GetMapping("/{startDate}/{endDate}")
    public Integer nbContratsValides(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
                                     @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd")  LocalDate endDate){
        return contratService.nbContratsValides(startDate,endDate);
    }
    @PostMapping
    public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp){
        return  icategorieProduit.addCategorieProduit(cp);
    }
    @PutMapping
    public CategorieProduit updateCategorieProduit(@RequestBody CategorieProduit cp){
        return icategorieProduit.updateCategorieProduit(cp);
    }
    @GetMapping("/search/{id}")
    public CategorieProduit retrieveCategorieProduit(@PathVariable(value = "id") Long id){
        return icategorieProduit.retrieveCategorieProduit(id);

    }
    @DeleteMapping("/{id}")
    public void removeCategorieProduit(@PathVariable(value = "id") Long id){
        icategorieProduit.removeCategorieProduit(id);

    }*/

}
