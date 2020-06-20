package com.webapp.test.domain.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.webapp.test.repositories.AlbumRepository;
import com.webapp.test.repositories.ArtistRepository;
import com.webapp.test.repositories.PublisherRepository;
import com.webapp.test.domain.Publisher;
import com.webapp.test.domain.Artist;
import com.webapp.test.domain.Album;

@Component
public class BootStrapData implements CommandLineRunner{
	
	private final ArtistRepository artistRepository;
	private final AlbumRepository albumRepository;
	private final PublisherRepository publisherRepository;
	
	public BootStrapData(ArtistRepository artistRepository, AlbumRepository albumRepository,PublisherRepository publisherRepository) {
		this.artistRepository = artistRepository;
		this.albumRepository = albumRepository;
		this.publisherRepository = publisherRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Publisher publisher = new Publisher();
		publisher.setName("Taylor Production");
		publisher.setCity("America");
		publisher.setState("LosAngeles");
		
		publisherRepository.save(publisher);
		
		System.out.println("Publisher of Production Count"+publisherRepository.count());
		
		
		
		Artist selena = new Artist("Selena","Gomez");
		Album a = new Album("Love Me Like You Do","11111");
		selena.getAlbums().add(a);
		a.getArtists().add(selena);
		
		a.setPublisher(publisher);
		publisher.getAlbums().add(a);
		
		artistRepository.save(selena);
		albumRepository.save(a);
		publisherRepository.save(publisher);
		
		Artist ketty =new Artist("Ketty","Perry");
		Album b = new Album("Roer","222222");
		ketty.getAlbums().add(b);
		b.getArtists().add(ketty);
		
		b.setPublisher(publisher);
		publisher.getAlbums().add(b);
		
		
		artistRepository.save(ketty);
		albumRepository.save(b);
		publisherRepository.save(publisher);
		
		
		
		System.out.println("Number of Album  "+ albumRepository.count());
		System.out.println("Production  Number of Album "+ publisher.getAlbums().size());

		
	}

}
