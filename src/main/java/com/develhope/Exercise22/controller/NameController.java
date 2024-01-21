package com.develhope.Exercise22.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @Operation(
            description = "Get endpoint for the Name controller.",
            summary = "This is a summary for the Name get endpoint.",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    )
            }
    )
    @GetMapping("/name")
    public String getName(@RequestParam String nome) {
        return nome;
    }

    @Operation(
            description = "Post endpoint for the Name controller.",
            summary = "This is a summary for the Name post endpoint.",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    )
            }
    )
    @PostMapping("/reversename")
    public String revName(@RequestBody String nome) {
        StringBuilder stringBuilder = new StringBuilder(nome).reverse();
        return stringBuilder.toString();
    }

}

