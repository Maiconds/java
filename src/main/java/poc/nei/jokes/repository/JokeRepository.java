package poc.nei.jokes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import poc.nei.jokes.entity.Joke;

import java.util.List;

@RepositoryRestResource
public interface JokeRepository extends JpaRepository<Joke, Long> {

    List<Joke> findByNameContaining(@Param("name") String name);
}

