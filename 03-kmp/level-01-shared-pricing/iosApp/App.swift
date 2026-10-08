import SwiftUI
import Shared
@main struct LearningApp: App {
 var body: some Scene { WindowGroup { WorkshopView() } }
}
struct WorkshopView: View {
 @State private var facade = CourseFacade()
 @State private var message = "Ready. Open this lab's stages before implementing."
 var body: some View {
  VStack(spacing: 20) {
   Text("Shared pricing").font(.title)
   Text(message).accessibilityIdentifier("result")
   Button("Run shared rule") { message = facade.act() }
  }.padding()
 }
}
