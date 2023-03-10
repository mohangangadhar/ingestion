//package com.ast.ingestion.controller.impl;
//
//import com.ast.ingestion.controller.impl.CustomUtils;
//import com.ast.ingestion.controller.impl.InvoiceDataControllerImpl;
//import com.ast.ingestion.dto.InvoiceDataDTO;
//import com.ast.ingestion.entity.InvoiceData;
//import com.ast.ingestion.mapper.InvoiceDataMapper;
//import com.ast.ingestion.mapper.ReferenceMapper;
//import com.ast.ingestion.service.InvoiceDataService;
//import org.hamcrest.Matchers;
//import org.hamcrest.core.Is;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.Arrays;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@RunWith(SpringRunner.class)
//public class InvoiceDataControllerImplTest {
//    //TODO: create the data Test generator class InvoiceDataBuilder
//    private static final String ENDPOINT_URL = "/invoice-datas";
//    @MockBean
//    private ReferenceMapper referenceMapper;
//    @InjectMocks
//    private InvoiceDataControllerImpl invoicedataController;
//    @MockBean
//    private InvoiceDataService invoicedataService;
//    @MockBean
//    private InvoiceDataMapper invoicedataMapper;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(this.invoicedataController).build();
//    }
//
//    @Test
//    public void getAll() throws Exception {
//        Mockito.when(invoicedataMapper.asDTOList(ArgumentMatchers.any())).thenReturn(InvoiceDataBuilder.getListDTO());
//
//        Mockito.when(invoicedataService.findAll()).thenReturn(InvoiceDataBuilder.getListEntities());
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
//
//    }
//
//    @Test
//    public void getById() throws Exception {
//        Mockito.when(invoicedataMapper.asDTO(ArgumentMatchers.any())).thenReturn(InvoiceDataBuilder.getDTO());
//
//        Mockito.when(invoicedataService.findById(ArgumentMatchers.anyInteger())).thenReturn(java.util.Optional.of(InvoiceDataBuilder.getEntity()));
//
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
//        Mockito.verify(invoicedataService, Mockito.times(1)).findById(1L);
//        Mockito.verifyNoMoreInteractions(invoicedataService);
//    }
//
//    @Test
//    public void save() throws Exception {
//        Mockito.when(invoicedataMapper.asEntity(ArgumentMatchers.any())).thenReturn(InvoiceDataBuilder.getEntity());
//        Mockito.when(invoicedataService.save(ArgumentMatchers.any(InvoiceData.class))).thenReturn(InvoiceDataBuilder.getEntity());
//
//        mockMvc.perform(
//                        MockMvcRequestBuilders.post(ENDPOINT_URL)
//                                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                                .content(CustomUtils.asJsonString(InvoiceDataBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isCreated());
//        Mockito.verify(invoicedataService, Mockito.times(1)).save(ArgumentMatchers.any(InvoiceData.class));
//        Mockito.verifyNoMoreInteractions(invoicedataService);
//    }
//
//    @Test
//    public void update() throws Exception {
//        Mockito.when(invoicedataMapper.asEntity(ArgumentMatchers.any())).thenReturn(InvoiceDataBuilder.getEntity());
//        Mockito.when(invoicedataService.update(ArgumentMatchers.any(), ArgumentMatchers.anyInteger())).thenReturn(InvoiceDataBuilder.getEntity());
//
//        mockMvc.perform(
//                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
//                                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                                .content(CustomUtils.asJsonString(InvoiceDataBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(invoicedataService, Mockito.times(1)).update(ArgumentMatchers.any(InvoiceData.class), ArgumentMatchers.anyInteger());
//        Mockito.verifyNoMoreInteractions(invoicedataService);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        Mockito.doNothing().when(invoicedataService).deleteById(ArgumentMatchers.anyInteger());
//        mockMvc.perform(
//                        MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(invoicedataService, Mockito.times(1)).deleteById(Mockito.anyInteger());
//        Mockito.verifyNoMoreInteractions(invoicedataService);
//    }