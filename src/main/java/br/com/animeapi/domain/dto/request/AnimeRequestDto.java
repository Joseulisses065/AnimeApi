package br.com.animeapi.domain.dto.request;

import br.com.animeapi.domain.enums.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


import java.time.LocalDate;


public class AnimeRequestDto {
    @NotBlank
    @NotNull
    private String name;
    @NotBlank
    @NotNull
    private String description;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private LocalDate releaseDate;
    @NotNull
    private Category category;
    @NotBlank
    @NotNull
    private String whereToWatch;

    public AnimeRequestDto() {
    }

    public AnimeRequestDto(String name, String description, LocalDate releaseDate, Category category, String whereToWatch) {
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.category = category;
        this.whereToWatch = whereToWatch;
    }

    public @NotBlank @NotNull String getName() {
        return name;
    }

    public void setName(@NotBlank @NotNull String name) {
        this.name = name;
    }

    public @NotBlank @NotNull String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank @NotNull String description) {
        this.description = description;
    }

    public @NotNull LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(@NotNull LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public @NotNull Category getCategory() {
        return category;
    }

    public void setCategory(@NotNull Category category) {
        this.category = category;
    }

    public @NotBlank @NotNull String getWhereToWatch() {
        return whereToWatch;
    }

    public void setWhereToWatch(@NotBlank @NotNull String whereToWatch) {
        this.whereToWatch = whereToWatch;
    }
}
