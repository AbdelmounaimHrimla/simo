/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.ws.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simo.simo.bean.Client;
import simo.simo.domain.service.ClientService;



/**
 *
 * @author mounaim
 */
@RestController
@RequestMapping("location-terain/client")
public class ClientRest {
    @Autowired
    private ClientService clientService;

    @GetMapping("/cin/{cin}")
    public Client findByCin(@PathVariable String cin) {
        return clientService.findByCin(cin);
    }

    @GetMapping("/nom/{nom}")
    public Client findByNom(@PathVariable String nom) {
        return clientService.findByNom(nom);
    }

    @GetMapping("/prenom/{prenom}")
    public Client findByPrenom(@PathVariable String prenom) {
        return clientService.findByPrenom(prenom);
    }

    @PostMapping("/cin/{cin}")
    public Client deleteByCin(@PathVariable String cin) {
        return clientService.deleteByCin(cin);
    }

    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Client client) {
        return clientService.save(client);
    }

    public ClientService getClientService() {
        return clientService;
    }

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }
    
}
