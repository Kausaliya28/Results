package org.result;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ResultController {
    private Map<String, List<ResultDetails>> map = new HashMap<>();

    @GetMapping("/result")
    List<ResultDetails> details(@RequestParam("studentId") int id) {
        return map.get(String.valueOf(id));
    }

    @PostMapping("/result")
    void addResult(@RequestParam("studentId") int id, @RequestBody ResultDetails details) {
        var list = map.computeIfAbsent(String.valueOf(id), k-> new ArrayList<>());
        list.add(details);
    }
}
