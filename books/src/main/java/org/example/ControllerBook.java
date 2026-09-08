package org.example;

/*

@Controller
public class HelloController {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Hello World!");
        model.setViewName("hello");
        return model;
    }
}


GET /books - Obtener todos los libros
• GET /books/{id} - Obtener un libro por su ID
• POST /books - Crear un nuevo libro
• PUT /books/{id} - Actualizar un libro existente por su ID
• DELETE /books/{id} - Eliminar un libro por su ID
 */
@RestController
@RequestMapping("/books")
public class ControllerBook {
    @GetMapping
    public List<Book> obtenerTodos() {
        return usuarioService.findAll();
    }



}
